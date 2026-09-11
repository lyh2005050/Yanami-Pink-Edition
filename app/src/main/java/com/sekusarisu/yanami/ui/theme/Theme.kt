package com.sekusarisu.yanami.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * Yanami MD3 主题
 *
 * - 支持多种预设颜色方案 (ThemeColor 枚举)
 * - ThemeColor.DYNAMIC + Android 12+: 壁纸动态取色
 * - ThemeColor.DYNAMIC + 低版本: 回退到 TEAL 配色
 * - 其他: 使用对应预设颜色的 light/dark ColorScheme
 */
@Composable
fun YanamiTheme(
        themeColor: ThemeColor = ThemeColor.TEAL,
        darkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
) {
        // 强制锁死粉色主题，忽略用户选择
        val lockedThemeColor = ThemeColor.TEAL
        val lockedDarkTheme = false // 强制浅色模式
        val colorScheme =
                when {
                        else -> {
                                if (lockedDarkTheme) lockedThemeColor.darkScheme!! else lockedThemeColor.lightScheme!!
                        }
                }

        MaterialTheme(colorScheme = colorScheme, typography = YanamiTypography, content = content)
}


