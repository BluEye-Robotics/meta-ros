DESCRIPTION = "Package for robot 2D self-localization using dynamic or static (MRPT or ROS) maps. 	The interface is similar to amcl (http://wiki. ros. org/amcl) but supports different particle-filter algorithms, several grid maps at different heights, range-only localization, etc."
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 roscpp tf std-msgs sensor-msgs nav-msgs mrpt-msgs mrpt-bridge pose-cov-ops dynamic-reconfigure"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_localization/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6f7aa3b0a47aba0f8a1d41a360a750d2"
SRC_URI[sha256sum] = "5775c752a5bf1d2769f09bca7c2105041bfea961a8126752d9f78fdd20eea680"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_localization-0.1.24-0"

inherit catkin
