SUMMARY = "A recipe to demonstrate how to integrate qt6 applications using Yocto project"
LICENSE = "CLOSED"

DEPENDS:append = " cmake cmake-native qtbase qtdeclarative qtquick3d qtdeclarative-native"
RDEPENDS:${PN}:append = " qtbase qtdeclarative "


SRC_URI:append = " file://yoctodemo/ "

S = "${WORKDIR}/yoctodemo"

inherit pkgconfig qt6-cmake

# EXTRA_OECMAKE:append = " -DQT_FEATURE_eglfs=ON  -DQT_QPA_EGLFS_RPI=ON -DQT_FEATURE_egl=ON -DFEATURE_opengl=ON -DFEATURE_opengles2=ON "
