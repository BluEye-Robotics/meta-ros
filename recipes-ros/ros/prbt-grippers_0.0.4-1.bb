DESCRIPTION = "The package provides gripper support for the pilz_robots package."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-pg70-support"

SRC_URI = "https://github.com/PilzDE/prbt_grippers-release/archive/release/melodic/prbt_grippers/0.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2752baee30632db2604464617345f1b8"
SRC_URI[sha256sum] = "6765306ed7868e1f6005ffaacebc8a0161eb24cf8fcbfefff9f587ccc10a6e52"

S = "${WORKDIR}/prbt_grippers-release-release-melodic-prbt_grippers-0.0.4-1"

inherit catkin
