DESCRIPTION = "Fetch ROS, packages for working with Fetch and Freight"
AUTHOR = "Alex Moriarty"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "fetch-calibration fetch-depth-layer fetch-description fetch-ikfast-plugin fetch-maps fetch-moveit-config fetch-navigation fetch-teleop"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_ros/0.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03b096a8cf2e2d040602149c5838abac"
SRC_URI[sha256sum] = "8eee5893c1058c6875ca642fa51dcb92bc7a66d0fa2fb5d7aa800f305809819a"

S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_ros-0.8.1-0"

inherit catkin
