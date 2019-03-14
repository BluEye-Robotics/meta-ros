DESCRIPTION = "Maintains a local obstacle map (point cloud, voxels or occupancy grid) from recent sensor readings within a configurable time window."
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 dynamic-reconfigure mrpt-bridge roscpp sensor-msgs tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_local_obstacles/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8a2b51088a8c48f5ca949c15cb39f2f"
SRC_URI[sha256sum] = "40b6c7ce3bb0cd3b6cfe48d215c391cda92e40e26820a06664c041964fbfa893"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_local_obstacles-0.1.22-0"

inherit catkin
