SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[aarch64.md5sum] = "8d628817f28ec1af8230fb50c6d2766a"
SRC_URI[aarch64.sha256sum] = "933690b758e0b0c4b56b0882b42f8fe5e8bf9075562f88762144a28c269f9157"

inherit opendreambox-precompiled-binary-new

FILES:${PN} = "${libdir}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"

PRECOMPILED_ARCH = "aarch64"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -d ${D}${libdir}/gstreamer-1.0
	install -m 0755 ${S}${libdir}/gstreamer-1.0/libgstdreamsinks.so ${D}${libdir}/gstreamer-1.0/
}
