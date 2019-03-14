DESCRIPTION = "OpenManipulator 3D model description for visualization and simulation"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "joint-state-publisher robot-state-publisher xacro urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_description/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ee6653cf91a489770777a0ca72cb6447"
SRC_URI[sha256sum] = "f44f4bb8965b79fffdf4906f742e4fccd178a55c8ee11e3abacc24828e5ae9c5"

ROS_SPN = "open_manipulator"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_description-2.0.1-0"

inherit catkin
