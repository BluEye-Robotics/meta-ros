DESCRIPTION = "Provides templates and examples for integrating the WAM-V model into gazebo with dynamics, sensors, etc."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-plugins hector-gazebo-plugins robot-localization usv-gazebo-plugins velodyne-gazebo-plugins wamv-description xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_gazebo/1.2.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6ef487d37f5b25dc1a91ad11c2a853cb"
SRC_URI[sha256sum] = "ca88141eb4cf4c4266d296a5f24d07c3a79b56e47787493c6596bbfbdc711f9f"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_gazebo-1.2.6-1"

inherit catkin
