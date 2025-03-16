PACKAGECONFIG:append = " eglfs kms gbm linuxfb"
EXTRA_OECMAKE:append = " \
    -DFEATURE_eglfs=ON \
    -DFEATURE_eglfs_gbm=ON \
    -DFEATURE_eglfs_kms=ON \
    -DEGLFS_PLATFORM=gbm \
    -DFEATURE_opengles2=ON \
"
do_configure:prepend() {
    export QT_QPA_DEFAULT_PLATFORM=eglfs
}
