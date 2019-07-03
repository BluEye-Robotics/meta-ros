DESCRIPTION = "rosatomic provides the C++11-style atomic operations by pulling symbols from the proposed Boost. Atomic package into the ros namespace. Once C++11-style atomics (std::atomic) are available from compilers, rosatomic will conditionally use those instead."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_realtime-release/archive/release/melodic/rosatomic/1.0.25-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "adedfe75f76bfe917a74ca43c689f69d"
SRC_URI[sha256sum] = "d4f38df7e64e7cef90ce597674a5832653f0e564dbc4163f5232fa180215b4d1"

ROS_SPN = "ros_realtime"
S = "${WORKDIR}/ros_realtime-release-release-melodic-rosatomic-1.0.25-0"

inherit catkin
