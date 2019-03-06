DESCRIPTION = "control_msgs contains base messages and actions useful for controlling robots. It \
provides representations for controller setpoints and joint and cartesian trajectories."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs actionlib-msgs"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1dd44d62e5deff32b778006130050475"
SRC_URI[sha256sum] = "230b0f893d1d57aff482b5672bb6cbadcf9908956a6e986c78d85006472f4dc5"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin
