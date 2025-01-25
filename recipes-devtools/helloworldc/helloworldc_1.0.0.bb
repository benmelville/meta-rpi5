SUMMARY = "${PN} file recipe"
LICENSE = "CLOSED"
SRC_URI = " file://hello_1.0 "

S = "${WORKDIR}/hello_1.0"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
    ${CC} ${S}/hello.c -o ${B}/hello
}

do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hello ${D}${bindir}/
}