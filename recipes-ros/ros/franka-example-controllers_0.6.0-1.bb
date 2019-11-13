DESCRIPTION = "franka_example_controllers provides example code for controlling Franka Emika research robots with ros_control"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation libeigen controller-interface dynamic-reconfigure franka-hw geometry-msgs hardware-interface libfranka pluginlib realtime-tools roscpp message-runtime"

RDEPENDS_${PN} = "franka-control franka-description message-runtime panda-moveit-config rospy"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_example_controllers/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03cc2b99a484b4e7187d82db0063335b"
SRC_URI[sha256sum] = "b897ffa8542fd6ddcd3c43da68b14966440df60d4821b6295236f56eae525ff7"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_example_controllers-0.6.0-1"

inherit catkin
