DESCRIPTION = "rosgraph contains the rosgraph command-line tool, which prints information about the ROS Computation Graph. It also provides an internal library that can be used by graphical tools."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-netifaces python-rospkg python-pyyaml"

RDEPENDS_${PN} = "python-netifaces python-rospkg python-pyyaml"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosgraph/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69220bd27ddfe1836d251f8b0409ddc3"
SRC_URI[sha256sum] = "e17c523458f3ae9cd5f463da95034fa8cea78a17fffdf0f1d2921047b812205d"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosgraph-1.14.3-0"

inherit catkin
