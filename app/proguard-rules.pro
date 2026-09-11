# 保留源文件和行号信息，方便调试
-keepattributes SourceFile,LineNumberTable
-keepattributes Signature
-keepattributes *Annotation*

# 保留所有数据模型类（被序列化/反序列化用到）
-keep class com.sekusarisu.yanami.domain.model.** { *; }

# 保留所有ViewModel
-keep class com.sekusarisu.yanami.**.*ViewModel { *; }

# 保留所有Screen类（Voyager导航用到）
-keep class com.sekusarisu.yanami.ui.screen.** { *; }

# 保留Kotlin元数据
-keepclassmembers class ** {
    @kotlin.Metadata <methods>;
}

# 保留Compose相关
-keepclassmembers class ** {
    @androidx.compose.runtime.Composable <methods>;
}

# 保留所有Parcelable实现
-keep class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# 保留枚举
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

