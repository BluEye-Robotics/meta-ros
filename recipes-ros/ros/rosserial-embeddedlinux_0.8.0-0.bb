DESCRIPTION = "rosserial for embedded Linux enviroments"
AUTHOR = "Paul Bouchier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosserial-client rospy rosserial-msgs"

RDEPENDS_${PN} = "rospy rosserial-msgs"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_embeddedlinux/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "408aae640e0a1fe63c97ae066e762f46"
SRC_URI[sha256sum] = "3834be581ac1ed6d71d9481ec8fdb9818be429b348ebcbfa1dd2311faf4bab1b"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_embeddedlinux-0.8.0-0"

inherit catkin
