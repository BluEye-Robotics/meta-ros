DESCRIPTION = "		turtle_tf2 demonstrates how to write a tf2 broadcaster and listener with the turtlesim. The tutle_tf2_listener commands turtle2 to follow turtle1 around as you drive turtle1 using the keyboard."
AUTHOR = "Denis Štogl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp rospy std-msgs tf2 tf2-ros turtlesim geometry-msgs roscpp rospy std-msgs tf2 tf2-ros turtlesim"

RDEPENDS_${PN} = "geometry-msgs roscpp rospy std-msgs tf2 tf2-ros turtlesim"

SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/melodic/turtle_tf2/0.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3fcd9349ea8dd39910ce0765bd7676ee"
SRC_URI[sha256sum] = "898be65b26bacc4c8ec117c9696b0506f18c33cce83c507442c3b4b239c64ada"

ROS_SPN = "geometry_tutorials"
S = "${WORKDIR}/geometry_tutorials-release-release-melodic-turtle_tf2-0.2.2-0"

inherit catkin
