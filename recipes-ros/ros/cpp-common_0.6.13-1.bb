DESCRIPTION = "cpp_common contains C++ code for doing things that are not necessarily ROS related, but are useful for multiple packages. This includes things like the ROS_DEPRECATED and ROS_FORCE_INLINE macros, as well as code for getting backtraces. This package is a component of"
AUTHOR = "John Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost console-bridge boost console-bridge"

RDEPENDS_${PN} = "boost console-bridge"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/cpp_common/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7304594af21c7302f926b882b3917ef5"
SRC_URI[sha256sum] = "b33c02fc639806932ec27a2400f896ba379fd1efd36484f0b68cdf547d6f5649"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-cpp_common-0.6.13-1"

inherit catkin
