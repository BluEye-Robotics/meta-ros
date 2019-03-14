DESCRIPTION = "octomap_server loads a 3D map (as Octree-based OctoMap) and distributes it to other nodes in a compact binary format. It also allows to incrementally build 3D OctoMaps, and provides map saving in the node octomap_saver."
AUTHOR = "Armin Hornung"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp visualization-msgs sensor-msgs pcl-ros pcl-conversions nav-msgs std-msgs std-srvs octomap octomap-msgs octomap-ros dynamic-reconfigure nodelet pcl roscpp visualization-msgs sensor-msgs pcl-ros pcl-conversions nav-msgs std-msgs std-srvs octomap octomap-msgs octomap-ros dynamic-reconfigure nodelet libpcl-all"

RDEPENDS_${PN} = "roscpp visualization-msgs sensor-msgs pcl-ros pcl-conversions nav-msgs std-msgs std-srvs octomap octomap-msgs octomap-ros dynamic-reconfigure nodelet libpcl-all"

SRC_URI = "https://github.com/ros-gbp/octomap_mapping-release/archive/release/melodic/octomap_server/0.6.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "06a2b0e5cd86f30d22e8c291bfe5e07e"
SRC_URI[sha256sum] = "3cd3bc10e3c4567f7589abd4d3029b5b346d8db5944fb427a9097cc35c3c9296"

ROS_SPN = "octomap_mapping"
S = "${WORKDIR}/octomap_mapping-release-release-melodic-octomap_server-0.6.3-0"

inherit catkin
