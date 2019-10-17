DESCRIPTION = "roslaunch is a tool for easily launching multiple ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-paramiko python3-rospkg python3-pyyaml rosclean rosgraph-msgs roslib rosmaster rosout rosparam rosunit"

RDEPENDS_${PN} = "python3-paramiko python3-rospkg python3-pyyaml rosclean rosgraph-msgs roslib rosmaster rosout rosparam rosunit"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/roslaunch/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ceba58cef57e7a30abf17e40482badf4"
SRC_URI[sha256sum] = "6332d21a5e4ba14d3cdc2d0a0492eb1ba63615e78c63dfbb828df59c93c87e63"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-roslaunch-1.14.3-0"

inherit catkin
