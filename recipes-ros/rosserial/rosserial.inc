SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c4c09d740629fb8603bd878576f19d76"
SRC_URI[sha256sum] = "e96cdeb81e1c03fb1c5ad85a740cb0a1a0836c52a24c6a5d97c975084b49d576"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosserial"
