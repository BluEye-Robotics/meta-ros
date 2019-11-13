DESCRIPTION = "Helper scripts and functionality to test industrial motion generation"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "eigen-conversions moveit-core moveit-msgs pilz-msgs moveit-core moveit-msgs pilz-msgs moveit-commander"

RDEPENDS_${PN} = "moveit-core moveit-msgs pilz-msgs moveit-commander"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion_testutils/0.4.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd022992aad0f2f8fd451b235a28d10c"
SRC_URI[sha256sum] = "76f0f77c2a79a01e0ab5480eedc5a9acdd398c64a8e5889ccf69d341bdd5594b"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion_testutils-0.4.7-1"

inherit catkin
