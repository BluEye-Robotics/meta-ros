DESCRIPTION = "Visualization package for rc_visard"
AUTHOR = "Monika Florek-Jasinska"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_description/2.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9077d2762c2b9e1c787ff5808c7654e0"
SRC_URI[sha256sum] = "2e824c7bf43dcb567b32bdd999fdc3a2066bbfdf0efa4af3d0124c731bbdcd27"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard_description-2.5.0-0"

inherit catkin
