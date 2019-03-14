DESCRIPTION = "Tools for writing ros-node-like bash scripts"
AUTHOR = "Martin Pecka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rosbash rospy"

SRC_URI = "https://github.com/peci1/rosbash_params-release/archive/release/melodic/rosbash_params/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0404deff3ced678a3676ba3ee62bad3d"
SRC_URI[sha256sum] = "af9e6ee8c0ffae32824fbbfa2dfcbb6483e0ad1757282f347ca744db60dcb9a1"

S = "${WORKDIR}/rosbash_params-release-release-melodic-rosbash_params-1.0.2-0"

inherit catkin
