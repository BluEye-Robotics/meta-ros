DESCRIPTION = "A vendor package for RxCpp"
AUTHOR = "RxCpp authors"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/rosin-project/rxcpp_vendor-release/archive/release/melodic/rxcpp_vendor/4.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c5182cbb59bb9a0a0ea0ab723c080e03"
SRC_URI[sha256sum] = "a9489ead897a2615307dc749869cef1d17caddde0eda42a362f9d811cc34980b"

S = "${WORKDIR}/rxcpp_vendor-release-release-melodic-rxcpp_vendor-4.1.0-1"

inherit catkin
