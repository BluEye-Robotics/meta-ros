DESCRIPTION = "The mbf_utility package"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp tf tf2 tf2-ros tf2-geometry-msgs geometry-msgs roscpp tf"

RDEPENDS_${PN} = "geometry-msgs roscpp tf"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_utility/0.2.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "acd5b16237d25261210111e8ddcaaa91"
SRC_URI[sha256sum] = "3c06c357bd9229ab1ff2ad139be81d98f93b2e0cd9e054d579a0ace7dbcd34bf"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_utility-0.2.4-1"

inherit catkin
