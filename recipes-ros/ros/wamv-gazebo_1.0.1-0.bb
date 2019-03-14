DESCRIPTION = "Provides templates and examples for integrating the WAM-V model into gazebo with dynamics, sensors, etc."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "gazebo-plugins hector-gazebo-plugins robot-localization usv-gazebo-plugins velodyne-gazebo-plugins wamv-description xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/vrx-release/archive/release/melodic/wamv_gazebo/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c1901df39e6ac856a5bed70467e76cdb"
SRC_URI[sha256sum] = "108c898691498d09b8946e2d081c9e3f8f3c247db5bfd785df968d4ae28dd189"

ROS_SPN = "vrx"
S = "${WORKDIR}/vrx-release-release-melodic-wamv_gazebo-1.0.1-0"

inherit catkin
