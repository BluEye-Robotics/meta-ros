DESCRIPTION = "Provides teleoperation using keyboard for OpenManipulator."
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs sensor-msgs open-manipulator-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_teleop/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ecd0989dd0fab594ec0979597ad245ae"
SRC_URI[sha256sum] = "4ee30aac61a7e2b66ced2141c722c2c7de04cbc061d985b49387f7a205e6eac1"

ROS_SPN = "open_manipulator"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_teleop-2.0.1-0"

inherit catkin
