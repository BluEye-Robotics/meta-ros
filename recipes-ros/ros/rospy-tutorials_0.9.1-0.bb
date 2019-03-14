DESCRIPTION = "This package attempts to show the features of ROS python API step-by-step, including using messages, servers, parameters, etc. These tutorials are compatible with the nodes in roscpp_tutorial."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation rostest std-msgs message-runtime rospy std-msgs"

RDEPENDS_${PN} = "message-runtime rospy std-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/melodic/rospy_tutorials/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f2898777118e1822ecdfd40506c935f"
SRC_URI[sha256sum] = "e7045e90505a3136f04f9d7d34a3eb67e81ffeb87d362291c9d1e3b72f72d927"

ROS_SPN = "ros_tutorials"
S = "${WORKDIR}/ros_tutorials-release-release-melodic-rospy_tutorials-0.9.1-0"

inherit catkin
