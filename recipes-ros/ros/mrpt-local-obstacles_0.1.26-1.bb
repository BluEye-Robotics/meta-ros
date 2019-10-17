DESCRIPTION = "Maintains a local obstacle map (point cloud, voxels or occupancy grid) from recent sensor readings within a configurable time window."
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 dynamic-reconfigure mrpt-bridge roscpp sensor-msgs tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_local_obstacles/0.1.26-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cde78478b4f5351d0a50240966cdc733"
SRC_URI[sha256sum] = "62af298ee1f3352bf32f91529121c5fd2b7976a5c6d9b6e5f0a22cee91dfe9b9"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_local_obstacles-0.1.26-1"

inherit catkin
