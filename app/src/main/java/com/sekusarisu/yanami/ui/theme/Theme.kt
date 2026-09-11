package com.sekusarisu.yanami.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

/**
 * Yanami MD3 主题
 *
 * 强制浅色模式，默认粉色少女风主题
 */
@Composable
fun YanamiTheme(
        themeColor: ThemeColor = ThemeColor.PINK,
        content: @Composable () -> Unit
) {
        // 强制使用浅色配色
        val colorScheme = themeColor.lightScheme!!

        MaterialTheme(colorScheme = colorScheme, typography = YanamiTypography, content = content)
}

