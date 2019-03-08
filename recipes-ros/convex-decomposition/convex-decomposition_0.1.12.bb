DESCRIPTION = "Convex Decomposition Tool for Robot Model"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

SRC_URI = "https://github.com/ros-gbp/convex_decomposition-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b6c1029aae54765e132657c9dfc859c6"
SRC_URI[sha256sum] = "b2e955afca445c8a4b016af537cf00ad54293e9a11ac4682a9cb7d35fcea1e61"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
