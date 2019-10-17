DESCRIPTION = "The cob_extern stack contains third party libraries needed for operating Care-O-bot. The packages are downloaded from the manufactorers website and not changed in any way."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = ""

RDEPENDS_${PN} = "libdlib libntcan libpcan libphidgets opengm"

SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/melodic/cob_extern/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba51072eda635021c6db914262b8457c"
SRC_URI[sha256sum] = "58d6df6b77b5a5546ce1641a09b583f1d899c8d250f9eee8cff13f76acc0834f"

S = "${WORKDIR}/cob_extern-release-release-melodic-cob_extern-0.6.13-1"

inherit catkin
