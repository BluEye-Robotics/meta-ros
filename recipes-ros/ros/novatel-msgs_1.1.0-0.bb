DESCRIPTION = "ROS messages which represent raw Novatel SPAN data."
AUTHOR = "NovAtel Support"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-msgs std-msgs message-generation geometry-msgs std-msgs message-runtime geometry-msgs nav-msgs"

RDEPENDS_${PN} = "std-msgs message-runtime geometry-msgs nav-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/novatel_span_driver-release/archive/release/melodic/novatel_msgs/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca9074d3e9348ca6f6e290f1681c2b82"
SRC_URI[sha256sum] = "a72561b3f85654b4e209dc7ac5738010ee49bb976023b1a014f4e345a2206797"

ROS_SPN = "novatel_span_driver"
S = "${WORKDIR}/novatel_span_driver-release-release-melodic-novatel_msgs-1.1.0-0"

inherit catkin
