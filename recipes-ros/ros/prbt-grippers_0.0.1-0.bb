DESCRIPTION = "The package provides gripper support for the pilz_robots package."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-pg70-support"

SRC_URI = "https://github.com/PilzDE/prbt_grippers-release/archive/release/melodic/prbt_grippers/0.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "43ed0b5323b67b2c6cc2cd15c9cc3b30"
SRC_URI[sha256sum] = "9fa5eb2334d8d788cfa9d111db851ee031c92afea5367ba347999641885aac5c"

S = "${WORKDIR}/prbt_grippers-release-release-melodic-prbt_grippers-0.0.1-0"

inherit catkin
