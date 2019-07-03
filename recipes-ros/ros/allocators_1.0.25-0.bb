DESCRIPTION = "Contains aligned allocation functions, as well as an STL-compatible AlignedAllocator class."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_realtime-release/archive/release/melodic/allocators/1.0.25-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b982e500dbebc509fcd4a169c19fcbed"
SRC_URI[sha256sum] = "585ef0525e4b0613ee2b9aca41a692dc9efab13c0a8e78ffe36e8efc03bd8810"

ROS_SPN = "ros_realtime"
S = "${WORKDIR}/ros_realtime-release-release-melodic-allocators-1.0.25-0"

inherit catkin
