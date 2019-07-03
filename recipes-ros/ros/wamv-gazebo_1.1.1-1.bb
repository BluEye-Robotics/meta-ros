DESCRIPTION = "Provides templates and examples for integrating the WAM-V model into gazebo with dynamics, sensors, etc."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-plugins hector-gazebo-plugins robot-localization usv-gazebo-plugins velodyne-gazebo-plugins wamv-description xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_gazebo/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "50d16171c4571a4ad522ad80bbe79463"
SRC_URI[sha256sum] = "fc0d4a6e47850abae35112cdd862e8145a8faa1f8c08fbda3ab7178c640d4aab"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_gazebo-1.1.1-1"

inherit catkin
