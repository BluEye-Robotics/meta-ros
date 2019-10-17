DESCRIPTION = "Helper scripts and functionality to test industrial motion generation"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "moveit-core moveit-msgs pilz-msgs eigen-conversions moveit-core moveit-msgs pilz-msgs moveit-commander"

RDEPENDS_${PN} = "moveit-core moveit-msgs pilz-msgs moveit-commander"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion_testutils/0.4.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "755a8813065731f653acb9c2c5ab997a"
SRC_URI[sha256sum] = "9f4ff40e12b93d6827ee65ce1dff8b0c20cf862a2d52c6b62a33114a31b290dd"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion_testutils-0.4.4-1"

inherit catkin
