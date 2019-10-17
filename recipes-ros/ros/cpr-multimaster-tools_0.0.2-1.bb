DESCRIPTION = "Multi-master tools for configuration and message relaying"
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "clock-relay message-relay multimaster-launch multimaster-msgs tf2-relay"

SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/cpr_multimaster_tools/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20d855b89b8f8ca00cbfb03243857269"
SRC_URI[sha256sum] = "4146b715489ee0a3271fe50e568ad19197b7f30c51bb7539cdee47cc0b8c5d32"

S = "${WORKDIR}/cpr_multimaster_tools-release-release-melodic-cpr_multimaster_tools-0.0.2-1"

inherit catkin
