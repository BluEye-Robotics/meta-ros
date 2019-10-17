DESCRIPTION = "cpp_common contains C++ code for doing things that are not necessarily ROS related, but are useful for multiple packages. This includes things like the ROS_DEPRECATED and ROS_FORCE_INLINE macros, as well as code for getting backtraces. This package is a component of"
AUTHOR = "John Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost console-bridge boost console-bridge"

RDEPENDS_${PN} = "boost console-bridge"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/cpp_common/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf2ca0ce58e761bd51a9120fd05b5b8a"
SRC_URI[sha256sum] = "af9fef611fcdbaf9296af1f04ee2af940412d36a3bdddc6098cf77a7c795dffa"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-cpp_common-0.6.12-0"

inherit catkin
