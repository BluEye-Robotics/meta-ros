DESCRIPTION = "The nodelet package is designed to provide a way to run multiple algorithms in the same process with zero copy transport between algorithms. This package provides both the nodelet base class needed for implementing a nodelet, as well as the NodeletLoader class used for instantiating nodelets."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-generation bondcpp boost pluginlib rosconsole roscpp std-msgs"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/melodic/nodelet/1.9.16-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "405be4cc42091670f96ebd2d7fb567bc"
SRC_URI[sha256sum] = "3a9e9701df570659d70f871eb7e1970dacd3b89c02513c456f8f0ea1a446d15a"

ROS_SPN = "nodelet_core"
S = "${WORKDIR}/nodelet_core-release-release-melodic-nodelet-1.9.16-0"

inherit catkin
