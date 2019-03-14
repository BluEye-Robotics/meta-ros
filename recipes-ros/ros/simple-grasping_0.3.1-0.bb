DESCRIPTION = "Basic grasping applications and demos."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib cmake-modules geometry-msgs grasping-msgs message-generation moveit-msgs pcl-ros roscpp sensor-msgs shape-msgs tf libvtk-qt libvtk-qt actionlib geometry-msgs grasping-msgs moveit-python message-runtime moveit-msgs pcl-ros roscpp sensor-msgs shape-msgs tf"

RDEPENDS_${PN} = "libvtk-qt actionlib geometry-msgs grasping-msgs moveit-python message-runtime moveit-msgs pcl-ros roscpp sensor-msgs shape-msgs tf"

SRC_URI = "https://github.com/ros-gbp/simple_grasping-release/archive/release/melodic/simple_grasping/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e9a38f71ab09284978ed8131748ca923"
SRC_URI[sha256sum] = "1dada4bbf81347bac9d7fee738e20246ec4f6f25a8983a7edda10894bd896a54"

S = "${WORKDIR}/simple_grasping-release-release-melodic-simple_grasping-0.3.1-0"

inherit catkin
