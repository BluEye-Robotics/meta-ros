DESCRIPTION = "OpenManipulator 3D model description for visualization and simulation"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "joint-state-publisher robot-state-publisher xacro urdf"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_with_tb3-release/archive/release/melodic/open_manipulator_with_tb3_description/1.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "118b17702e90520352879ada770f9057"
SRC_URI[sha256sum] = "75b91b560d2d284556401d76dd7160eb216813715fd5da607f139b3fc5f6e68d"

ROS_SPN = "open_manipulator_with_tb3"
S = "${WORKDIR}/open_manipulator_with_tb3-release-release-melodic-open_manipulator_with_tb3_description-1.1.0-2"

inherit catkin
