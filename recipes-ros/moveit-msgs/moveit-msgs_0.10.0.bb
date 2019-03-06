DESCRIPTION = "Messages, services and actions used by MoveIt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs sensor-msgs actionlib-msgs octomap-msgs object-recognition-msgs"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a01f76aaef126d80dd2636df1f39f55f"
SRC_URI[sha256sum] = "68885eafd4e6fbf9fee33e4cfd85b75ecd7465a29fffc52b3b75a3c1931da6f4"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
