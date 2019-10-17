DESCRIPTION = "roswtf is a tool for diagnosing issues with a running ROS system. Think of it as a FAQ implemented in code."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest python3-paramiko python3-rospkg rosbuild rosgraph roslaunch roslib rosnode rosservice"

RDEPENDS_${PN} = "python3-paramiko python3-rospkg rosbuild rosgraph roslaunch roslib rosnode rosservice"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/roswtf/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b4a358d5336ec1bb46d5e587a3df9272"
SRC_URI[sha256sum] = "4b80685e087fb64bb3c54d156c2a5b7953092dd83c14906d311def246ebfdd93"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-roswtf-1.14.3-0"

inherit catkin
