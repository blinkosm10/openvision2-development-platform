SUMMARY = "Static device nodes needed before devtmpfs"
LICENSE = "MIT"

inherit allarch

do_install() {
        install -d ${D}/dev
        mknod -m 600 ${D}/dev/console c 5 1
        mknod -m 666 ${D}/dev/null c 1 3
}

FILES:${PN} = "/dev"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_compile[noexec] = "1"
