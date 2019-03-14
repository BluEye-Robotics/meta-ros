DESCRIPTION = "Launch and config files designed for use with the p2os stack."
AUTHOR = "Hunter L. Allen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "p2os-driver p2os-msgs p2os-urdf p2os-teleop"

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_launch/2.1.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "28eb1ea387156e4d95660b33cbe7942d"
SRC_URI[sha256sum] = "44ce86f957548ceb122a58f2073bf32128e8e5c2ed32a95e4c76ad16ae37856f"

ROS_SPN = "p2os"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_launch-2.1.1-3"

inherit catkin
