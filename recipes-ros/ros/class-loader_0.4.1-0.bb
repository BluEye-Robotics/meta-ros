DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during runtime and the foundation of the higher level ROS "pluginlib" library. class_loader utilizes the host operating system's runtime loader to open runtime libraries (e. g. . so/. dll files), introspect the library for exported plugin classes, and allows users to instantiate objects of said exported classes without the explicit declaration (i. e. header file) for those classes."
AUTHOR = "Mirza Shah"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules boost console-bridge poco"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/class_loader-release/archive/release/melodic/class_loader/0.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "14d5c986bdb07a6dee4de312fb693096"
SRC_URI[sha256sum] = "09c3d35e5afb806c612e843ef15078b97a0a6051174a45712d38c38345eae4a5"

S = "${WORKDIR}/class_loader-release-release-melodic-class_loader-0.4.1-0"

inherit catkin
