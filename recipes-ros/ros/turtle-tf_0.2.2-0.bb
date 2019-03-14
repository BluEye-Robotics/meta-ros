DESCRIPTION = "turtle_tf demonstrates how to write a tf broadcaster and listener with the turtlesim. The tutle_tf_listener commands turtle2 to follow turtle1 around as you drive turtle1 using the keyboard."
AUTHOR = "James Bowman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp rospy std-msgs tf turtlesim geometry-msgs roscpp rospy std-msgs tf turtlesim"

RDEPENDS_${PN} = "geometry-msgs roscpp rospy std-msgs tf turtlesim"

SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/melodic/turtle_tf/0.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb2163eaf9512cd951a52a8f3b960466"
SRC_URI[sha256sum] = "182947fcfff5ec44a27e343306a78fd488fbcaff6d8ca894ed0646846293f02d"

ROS_SPN = "geometry_tutorials"
S = "${WORKDIR}/geometry_tutorials-release-release-melodic-turtle_tf-0.2.2-0"

inherit catkin
