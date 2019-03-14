DESCRIPTION = "Components of MoveIt! used for manipulation"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen actionlib dynamic-reconfigure moveit-core moveit-ros-move-group moveit-ros-planning moveit-msgs roscpp rosconsole tf2-eigen pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_manipulation/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94c43dd645c821fdfb8efaa021b1e096"
SRC_URI[sha256sum] = "2bbac6007c1cf0799f38dfbadaaed30957d5d1d31fd7781e599254db553517a9"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_manipulation-1.0.1-0"

inherit catkin
