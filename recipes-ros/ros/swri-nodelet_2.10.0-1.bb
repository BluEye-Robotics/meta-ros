DESCRIPTION = "This package provides a simple script to write simple launch files that can easily switch between running nodelets together or as standalone nodes."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nodelet roscpp std-msgs"

RDEPENDS_${PN} = "rosbash"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_nodelet/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4afe478a6da1d9a8bff003263f1e35b6"
SRC_URI[sha256sum] = "bf8858c85d44f78fc4a723e3afe185f3791b850dc90c82ec6ca863d1e863d473"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_nodelet-2.10.0-1"

inherit catkin
