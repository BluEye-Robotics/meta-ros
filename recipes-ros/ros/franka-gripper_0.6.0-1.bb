DESCRIPTION = "This package implements the franka gripper of type Franka Hand for the use in ros"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp message-generation libfranka control-msgs actionlib sensor-msgs xmlrpcpp actionlib-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_gripper/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "660503aebe9b435a7c6bca89c08892ad"
SRC_URI[sha256sum] = "ffa8aa860f953517851d9db0e6d0bdf5e87f26cf6d6a017fc5c13d10cff9b448"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_gripper-0.6.0-1"

inherit catkin
