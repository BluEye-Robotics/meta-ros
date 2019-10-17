DESCRIPTION = "Maintains a local obstacle map (point cloud, voxels or occupancy grid) from recent sensor readings within a configurable time window."
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 dynamic-reconfigure mrpt-bridge roscpp sensor-msgs tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_local_obstacles/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21e0e6d9c34e84c930f76de9d84c1467"
SRC_URI[sha256sum] = "15f6abde9e318e1e0afaf27bc6cc20bd84943a5d14cb0f22f509686bf4a492a6"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_local_obstacles-0.1.24-0"

inherit catkin
