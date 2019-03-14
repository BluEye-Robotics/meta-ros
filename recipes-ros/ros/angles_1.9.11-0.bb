DESCRIPTION = "This package provides a set of simple math utilities to work with angles. The utilities cover simple things like normalizing an angle and conversion between degrees and radians. But even if you're trying to calculate things like the shortest angular distance between two joinst space positions of your robot, but the joint motion is constrained by joint limits, this package is what you need. The code in this packge is stable and well tested. There are no plans for major changes in the near future."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/geometry_angles_utils-release/archive/release/melodic/angles/1.9.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "30a58b5ff75af8d362fa36f3a023228e"
SRC_URI[sha256sum] = "e234fbb316d2e74febab2c47710ecb9c1c7231c439d68a2f8540b416245b2b9a"

S = "${WORKDIR}/geometry_angles_utils-release-release-melodic-angles-1.9.11-0"

inherit catkin
