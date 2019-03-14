DESCRIPTION = "Helper scripts and functionality to test industrial motion generation"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "moveit-core moveit-msgs pilz-msgs eigen-conversions moveit-core moveit-msgs pilz-msgs"

RDEPENDS_${PN} = "moveit-core moveit-msgs pilz-msgs"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion_testutils/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9073691183b110d0909e1e34ef23518f"
SRC_URI[sha256sum] = "7f305223df193deadaf821302755cfbc4388145691b85e3d817f47175d7e8012"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion_testutils-0.4.2-0"

inherit catkin
